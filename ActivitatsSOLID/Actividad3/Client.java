package Actividad3;

// import java.util.ArrayList;
// import java.util.List;


class Client {

    public static void main(String[] args) {
         // Solo printDocument()
        AdvancedPrinter advanced = new AdvancedPrinter();
        advanced.printDocument();
        advanced.sendFax();

        PrintDocument basic = new BasicPrinter();
        basic.printDocument();
        // printer.sendFax();//Will throw error

        /*
         * List<Printer> printers = new ArrayList<Printer>(); printers.add(new
         * AdvancedPrinter()); printers.add(new BasicPrinter());
         *
         * for (Printer device : printers) { device.printDocument(); //
         * device.sendFax(); // Will throw error } //
         * printers.forEach(Printer::printDocument);//ok
         *
         */

    }

}
