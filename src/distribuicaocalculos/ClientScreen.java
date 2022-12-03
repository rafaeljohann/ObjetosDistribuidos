package distribuicaocalculos;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ClientScreen extends UnicastRemoteObject implements IClient {
    IServer server;
    public ClientGUI panel;
    
    public ClientScreen() throws RemoteException{
        super();
    }
    
    public int[] bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        
        return arr;
    }

    @Override
    public void notifyResults(int[] numbers) throws RemoteException {
        String appendado = "";
        for(int i = 0; i < numbers.length; i++)
        {
            appendado = appendado + " " + numbers[i];
        }
       
        panel.txtSaidaPedidos.append(appendado);
        panel.txtSaidaPedidos.append("\n");
    }

    @Override
    public int[] findArray() throws RemoteException {
        return server.findArrayInt();
    }
    
}
