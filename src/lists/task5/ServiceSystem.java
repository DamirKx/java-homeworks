package lists.task5;

import java.util.LinkedList;
import java.util.Random;

public class ServiceSystem {
    private LinkedList<Client> clients = new LinkedList<>();
    private Random random = new Random();

    public void add(Client client){
        if (client.isVip){
            clients.addFirst(client);
        } else {
            clients.addLast(client);
        }
    }

    public void service(){
        System.out.println("Клиент: " + clients.getFirst() + " обслужен.");
        clients.removeFirst();
    }

    public void rebalance(){
        if (clients.size() > 10){
            int index = 0;
            for (int i = 0; i < clients.size(); i++){
                if (i > 10){
                    Client client = clients.get(i);
                    clients.remove(i);
                    clients.add(5, client);
                    break;
                }
            }
        }
    }

    public void printClients(){
        for (Client client : clients) {
            System.out.println(client.toString());
        }
    }

}
