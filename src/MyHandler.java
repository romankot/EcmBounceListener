import org.apache.commons.io.IOUtils;

import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Set;

public class MyHandler implements SOAPHandler<SOAPMessageContext>
{
    private boolean isRequest;

    public boolean handleMessage(SOAPMessageContext smc) {

        Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        SOAPMessage message = smc.getMessage();

        if (outboundProperty.booleanValue()) {
            System.out.print(" SOAP Request ");
            isRequest = true;
        } else {
            System.out.print(" SOAP Respone ");
            isRequest = false;
        }
        try {
            String logfilename = EcmBounceListener.m_log_control_xml_filename;
            //String logfilename = "c:\\tmp\\ecmBounceHandlingLOG.txt";
            if (!logfilename.isEmpty()) {
                ByteArrayOutputStream put_stream = new ByteArrayOutputStream();
                message.writeTo(put_stream);
                Global.out = put_stream.toByteArray();
                ByteArrayInputStream bais = new ByteArrayInputStream(Global.out);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                IOUtils.copy(bais, baos);
                FLogger.logToFile(baos, logfilename, isRequest);
                //System.out.println(FLogger.prettyFormat(out.toString()));
            }
        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("");
        // if this function will return true, only then the chaining concept will work.
        // if we return outboundProperty which happens to be false in some cases
        // the chaining will not work. 
        //return outboundProperty; 
        return true;

    }

    public Set getHeaders() {
        return null;
    }

    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    public void close(MessageContext context) {
    }
}
