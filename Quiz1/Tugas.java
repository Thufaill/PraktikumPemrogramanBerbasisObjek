package Quiz1;

public class Tugas {
    private String judul;
    private int bobot;
    private Programmer programmer;
    private boolean selesai;

    public Tugas(String judul, int bobot) {
        this.judul = judul;
        this.bobot = bobot;
        this.programmer = null;
        this.selesai = false;
    }

    public void setProgrammer(Programmer programmer) {
        this.programmer = programmer;
    }

    public void tandaSelesai() {
        selesai = true;
    }

    public String getJudul() {
        return judul;
    }

    public int getBobot() {
        return bobot;
    }

    public Programmer getProgrammer() {
        return programmer;
    }

    public boolean isSelesai() {
        return selesai;
    }

    public String info() {
        String namaProgrammer;

        if (programmer == null) {
            namaProgrammer = "(belum ditugaskan)";
        } else {
            namaProgrammer = programmer.getNama();
        }

        String status;

        if (selesai) {
            status = "SELESAI";
        } else {
            status = "PROSES";
        }

        return judul + " [" + bobot + "] - " + namaProgrammer + " - " + status;
    }
}
