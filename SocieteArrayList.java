import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>,IRechercheAvancee<Employe> {

    final List<Employe> employees = new ArrayList<>();
    @Override
    public void ajouterEmploye(Employe t) {
        employees.add(t);

    }
    @Override
    public boolean rechercherEmploye(String nom) {
        boolean test= false;
        for (Employe e : employees) {
            if (e.getNom().equals(nom)) {
                test= true;
            }

        }
        return test ;
    }
    @Override
    public boolean rechercherEmploye(Employe t) {
        for (Employe e : employees) {
            if (e.getNom().equals(t.getNom()) && (e.id == t.id)) {
                return true;
            }

        }
        return false;

    }
    @Override

    public void supprimerEmploye(Employe t) {
        employees.remove(t);

    }
    @Override
    public void displayEmploye() {
        for (Employe e : employees) {
            System.out.println(e.toString());
        }
    }
    @Override
    public void trierEmployeParId() {
        Collections.sort(employees);


    }
    @Override
    public void trierEmployeParNomDépartementEtGrade(){
        Comparator<Employe> comp = Comparator
                .comparing(Employe::getNomDepart)
                .thenComparing(Employe::getGrade)
                .thenComparing(Employe::getNom);
        Collections.sort(employees, comp);
    }
    @Override
    public List<Employe>rechercherParDepartement(String nomDepart){
        List<Employe> employees1 = new ArrayList<>();
        for (Employe e : employees) {
            if (e.getNomDepart().equalsIgnoreCase(nomDepart)) {
                employees1.add(e);
            }
        }
        return employees1;
    }
}

