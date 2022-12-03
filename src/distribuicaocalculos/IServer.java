package distribuicaocalculos;


import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public interface IServer extends Remote{
    public void registerClient(IClient c) throws RemoteException;
    public int[] findArrayInt() throws RemoteException;
}
