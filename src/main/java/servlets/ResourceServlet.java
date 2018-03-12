package servlets;

import resources.ResourceServer;
import resources.TestResource;
import sax.ReadXMLFileSAX;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResourceServlet extends HttpServlet {
    public static  final  String  PAGE_URL = "/resources";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String param = req.getParameter("path");
        TestResource testResource = (TestResource) ReadXMLFileSAX.readXML(param);
        ResourceServer.testResource = testResource;
}
}