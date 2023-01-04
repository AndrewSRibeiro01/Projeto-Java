
public class TestaEscopo {

    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 20;
        int quantidadedePessoas = 3;

        // boolean acompanhado = quantidadedePessoas >= 2;

        boolean acompanhado;

        if (quantidadedePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        System.out.println("Valor acompanhado = " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}
