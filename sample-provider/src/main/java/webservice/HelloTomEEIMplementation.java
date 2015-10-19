package webservice;

import javax.ejb.Stateless;
import javax.jws.WebService;
 
@Stateless
@WebService(
        portName = "HelloTomEEPort",
        serviceName = "HelloTomEEService",
        targetNamespace = "http://sortedset.com/wsdl",
        endpointInterface = "webservice.HelloTomEEWs")
public class HelloTomEEIMplementation implements HelloTomEEWs {
 
    public int sum(int add1, int add2) {
        return add1 + add2;
    }
 
    public int multiply(int mul1, int mul2) {
        return mul1 * mul2;
    }
}