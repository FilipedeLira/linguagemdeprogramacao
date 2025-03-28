package exercicio02;
class Medico {
    protected boolean trabalhaNoHospital;

    public Medico(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

    public void tratarPaciente() {
        System.out.println("O médico está tratando um paciente.");
    }
}
