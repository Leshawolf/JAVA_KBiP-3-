package zad2;

class Main {

    public static void main(String[] args) throws OkladException,PremiyaException {
        try {
            Worker work = new Worker("23213", "������ �����",13.40);
            System.out.println(work);
            System.out.println("��������: " + work.checkSalary(20));
            ContractWorker cwork = new ContractWorker("������ �.�", "�������", -30);
            StateWorker swork = new StateWorker("������� �.�", "��������", -150, 300);
            System.out.println(cwork);
            System.out.println(swork);
            System.out.println("��������: " + cwork.checkSalary(-19));
            System.out.println("��������: " + swork.checkSalary(-23));
        }
        catch (OkladException e)
        {
            System.out.println(e.getMessage());
        }
        catch (PremiyaException e )
        {
            System.out.println(e.getMessage());
        }
    }
}
