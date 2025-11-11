public  class Employe implements Comparable<Employe> {
    public int id;
    String nom;
    String prenom;
    String nomDepart;
    int grade;

    public Employe(){

    }

    public Employe(int id, String nom, String prenom, String nomDepart, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepart = nomDepart;
        this.grade = grade;

    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;

    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNomDepart() {
        return nomDepart;
    }
    public void setNomDepart(String nomDepart) {
        this.nomDepart = nomDepart;
    }

    @Override
    public String toString() {
        return "nom:"+ nom  +"prenom:" + prenom + "Departement:" + nomDepart + "grade:" + grade;
    }

    @Override
    public int compareTo(Employe e) {
        return Integer.compare(this.id, e.id);
    }




}

