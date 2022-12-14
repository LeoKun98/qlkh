package qlkh;

/**
 * DONE
 * @author Lilly
 */
public class Main {

    public static void mainMenu(Manager manager) {
        Tools.cls();
        System.out.println("---QUAN LY KHO HANG THIET BI DIEN TU---");
        System.out.println("1. Nhap hang");
        System.out.println("2. Xuat hang");
        System.out.println("3. Kiem ke hang");
        System.out.println("4. Tra cuu hang hoa");
        System.out.println("5. Truy xuat hoa don");
        System.out.println("6. Thiet lap kho");
        System.out.println("7. Thoat chuong trinh");
        System.out.print("Vui long nhap 1 so (1->7): ");
        String option = Tools.scan.nextLine();
        while (!Tools.isInteger(option) || Integer.parseInt(option) < 1 || Integer.parseInt(option) > 7) {
            System.out.print("Vui long nhap 1 so (1->7): ");
            option = Tools.scan.nextLine();
        }
        switch (Integer.parseInt(option)) {
            case 1: {
                if (!manager.importPD()) {
                    System.out.println("---Nhap hang khong thanh cong---");
                } else {
                    System.out.println("---Nhap hang thanh cong---");
                }
                Tools.continute();
                break;
            }
            case 2: {
                if (!manager.exportPD()) {
                    System.out.println("---Xuat hang khong thanh cong---");
                } else {
                    System.out.println("---Xuat hang thanh cong---");
                }
                Tools.continute();
                break;
            }
            case 3: {
                manager.inventory();
                break;
            }
            case 4: {
                
                break;
            }
            case 5: {
                manager.invoiceList.menu();
                break;
            }
            case 6: {
                manager.positionList.menu();
                break;
            }
            case 7: {
                System.exit(1);
            }
        }
        mainMenu(manager);
    }
    
    public static void main(String[] args) {
        Manager manager = new Manager();
        mainMenu(manager);
    }
}
