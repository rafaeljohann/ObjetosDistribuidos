package distribuicaocalculos;


import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public interface IClient extends Remote{
    public void notifyResults(int[] p) throws RemoteException;
    public int[] bubbleSort(int arr[]) throws RemoteException;
    public int[] findArray() throws RemoteException;
}
