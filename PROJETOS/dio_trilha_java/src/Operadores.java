public class Operadores {

    public static void main(String[] args) {
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = + numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        int variavel = 5;
        //x repeticao

        System.out.println( ++ variavel);

        System.out.println(variavel);

        System.out.println( variavel -- );

        System.out.println(variavel);

        boolean nome = true;

        System.out.println(!nome);

        System.out.println(nome);

        nome = !nome;

        System.out.println(nome);

        int a, b;

        a = 5;
        b = 6;

        //if(a==b)
        //resultado = "verdadeiro";
        //else
        //resultado = "falso";
        String resultado = a==b ?"verdadeiro" : "falso";

        System.out.println(resultado);

        //Relacionais
        String nomeUm = "GLEYSON";
        String nomeDois = new String("GLEYSON");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois?" + simNao);

        if(numero1 == numero2){//true
            System.out.println("a nossa condição é verdadeira");
        }

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois?" + simNao);

        //Lógicos
        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 && (7 > 4)) {
            System.out.println("as duas condições são verdadeiras");
        }

        System.out.println("fim");

    }
}
