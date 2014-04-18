import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;


public class MyHandlerResolver implements HandlerResolver
{
    public List getHandlerChain(PortInfo portInfo) {
        ArrayList<Handler> handlerChain = new ArrayList<Handler>();
        handlerChain.add(new MyHandler());
        return handlerChain;
    }
}
