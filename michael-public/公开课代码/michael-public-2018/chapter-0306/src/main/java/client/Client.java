package client;

import server.IOperation;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class Client {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        IOperation iOperation= (IOperation)Naming.lookup("rmi://127.0.0.1:1099/Operation");
        System.out.println(iOperation);
        System.out.println(iOperation.add(1,1));
    }
}
