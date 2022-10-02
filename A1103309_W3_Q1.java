class machine implements Runnable{
    private static int tickets = 10_000;
    int soldTickets;
    Thread t;
    public machine(String name){
        soldTickets = 0;
        t = new Thread(this,name);
        t.start();
    }

    public void run(){
        for(;;){
            if(sellTickets() == true){
            soldTickets++;
            //System.out.println(t.getName() + "賣了" + soldTickets + "張票");
            }else{
                break;
            }
        }
        System.out.println(t.getName() + "總共賣了" + soldTickets + "張票");
    }

    private synchronized static boolean sellTickets(){
        if(tickets > 0){
            tickets--;
            return true;
        }else{
            return false;
        }
    }
} 

public class A1103309_W3_Q1 {
    public static void main(String[] args){
        machine machineA = new machine("machineA");
        machine machineB = new machine("machineB");
        machine machineC = new machine("machineC");
        machine machineD = new machine("machineD");
    }
}
