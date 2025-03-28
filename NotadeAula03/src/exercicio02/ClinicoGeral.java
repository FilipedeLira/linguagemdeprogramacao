package exercicio02;
class ClinicoGeral extends Medico {
    private boolean atendeEmCasa;

    public ClinicoGeral(boolean trabalhaNoHospital, boolean atendeEmCasa) {
        super(trabalhaNoHospital);
        this.atendeEmCasa = atendeEmCasa;
    }

    public void receitar() {
        System.out.println("O clínico geral está receitando um medicamento.");
    }
}