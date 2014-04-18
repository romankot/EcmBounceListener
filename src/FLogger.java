import java.io.*;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class FLogger
{
    public static void logToFile(ByteArrayOutputStream out, String path, boolean flag) throws RemoteException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM");
        DateFormat dateFormatTime = new SimpleDateFormat(" HH:mm:ss");
        Date date = new Date();
        BufferedWriter bw = null;
        try
        {
            File log = new File(path);

            if (!log.exists())
            {
                System.out.println("\nLog file doesn't exist. Creating new log file\n");
                log.createNewFile();
            }

            FileWriter fw = new FileWriter(log.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);

            String req_or_resp_str = flag ? "REQUEST" : "RESPONCE";
            bw.append(String.format("\n %s %s %s \n", req_or_resp_str, dateFormat.format(date), dateFormatTime.format(date)));
            bw.append(FLogger.prettyFormat(out.toString()));
        }
        catch (IOException ex)
        {
            System.out.println("\nCouldn't write to file: " + ex.getLocalizedMessage() );
            //ecmOutConnector.logDebug("\nCouldn't write to file: " + ex.getLocalizedMessage());
        } finally {
            try {bw.close();} catch (Exception ex) {}
        }
    }
    private static String prettyFormat(String input, int indent) {
        try
        {
            Source xmlInput = new StreamSource(new StringReader(input));
            StringWriter stringWriter = new StringWriter();
            StreamResult xmlOutput = new StreamResult(stringWriter);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            // This statement works with JDK 6
            transformerFactory.setAttribute("indent-number", indent);

            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(xmlInput, xmlOutput);
            return xmlOutput.getWriter().toString();
        }
        catch (Throwable e)
        {
            // You'll come here if you are using JDK 1.5
            // you are getting an the following exeption
            // java.lang.IllegalArgumentException: Not supported: indent-number
            // Use this code (Set the output property in transformer.
            try
            {
                Source xmlInput = new StreamSource(new StringReader(input));
                StringWriter stringWriter = new StringWriter();
                StreamResult xmlOutput = new StreamResult(stringWriter);
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", String.valueOf(indent));
                transformer.transform(xmlInput, xmlOutput);
                return xmlOutput.getWriter().toString();
            }
            catch(Throwable t)
            {
                return input;
            }
        }
    }

    private static String prettyFormat(String input) {
        return prettyFormat(input, 2);
    }
}
