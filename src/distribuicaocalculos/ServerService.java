package distribuicaocalculos;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ServerService extends UnicastRemoteObject implements IServer {
    List<IClient> clients = new ArrayList<IClient>();
    List<int[]> numbers = new ArrayList<int[]>();
    
    public void iniciarCargaLista() {
        int[] arr = null;
                
        for(int i = 0; i < 10; i++) {
            arr = preencherValoresAleatorios();
            numbers.add(arr);
        }
    }
    
    private int[] preencherValoresAleatorios() {
        return new Random().ints(1, 10000).limit(10000).toArray();
    }
    public ServerService() throws RemoteException{
        super();
        iniciarCargaLista();
    }

    @Override
    public void registerClient(IClient c) throws RemoteException {
        clients.add(c);
    }

    @Override
    public int[] findArrayInt() throws RemoteException {
        if (!numbers.isEmpty()) {
            int[] arrayChoosed = numbers.get(0);
            numbers.remove(0);
            
            return arrayChoosed;
        }else {
            return null;
        }
    }
}
