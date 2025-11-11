//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1253,"Ali","riahi","MATH",12);
        Employe e2 = new Employe(1212, "Sami", "RH", "Assistant",19);
        Employe e3 = new Employe(2, "Mouna", "IT", "Technicienne",14);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);




        System.out.println();
        societe.displayEmploye();



        System.out.println();
        societe.trierEmployeParId();
        societe.displayEmploye();




        System.out.println();
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
        Employe e10 = new Employe(1254, "Sami", "RH", "Assistant",19);
        Employe e11 = new Employe(1212, "Sami", "IT", "Assistant",19);
        Employe e12 = new Employe(1212, "Sami", "IT", "Assistant",19);
        Employe e13 = new Employe(1213, "Sami", "IT", "Assistant",19);
        societe.ajouterEmploye(e10);
        societe.ajouterEmploye(e11);
        societe.ajouterEmploye(e12);
        societe.ajouterEmploye(e13);



        System.out.println("=== Employés du département IT ===");
        for (Employe e : societe.employees) {
            societe.rechercherParDepartement("IT");

        }
    }

}
// J ai pu pas resoulver la derniere isntruction
