package Actividad4;

class Client {

    public static void main(String[] args) {


        PaymentManager manager = new PaymentManager();
        manager.loadUsers();

        ShowHelper show = new ShowHelper(manager);
        show.showPreviousPayments();
        show.processNewPayments();

    }

}
