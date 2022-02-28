package application;

import entities.Documento;
import entities.DocumentoCNH;
import entities.DocumentoCPF;
import entities.DocumentoRg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProgramDocumento {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Documento> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Quantos documentos você quer emitir? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Qual tipo de documento quer emitir (RG/CPF/CNH)? ");
            String doc = sc.next();
            System.out.println("Documento #" + (i + 1) + ":");
            System.out.print("Insira seu nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Estado UF (Sigla): ");
            String uf = sc.next();
            System.out.print("Data de nascimento: ");
            Date dataNascimento = sdf.parse(sc.next());

            if (Objects.equals(doc, "RG")) {
                System.out.print("Informe o RG: ");
                String rg = sc.next();
                list.add(new DocumentoRg(nome, uf, dataNascimento, rg));
            } else if (Objects.equals(doc, "CNH")) {
                System.out.print("Informe o número da CNH: ");
                String numeroCNH = sc.next();
                System.out.print("Informe a categoria: ");
                Character categoria = sc.next().charAt(0);
                System.out.print("Informe a validade: ");
                Date validade = sdf.parse(sc.next());
                list.add(new DocumentoCNH(nome, uf, new Date(), numeroCNH, categoria, validade));
            } else {
                System.out.print("Informe o CPF: ");
                String cpf = sc.next();
                list.add(new DocumentoCPF(nome, uf, dataNascimento, cpf));
            }
        }
        System.out.println();
        System.out.println("Emissão Documentos:");
        for (Documento doc : list) {
            System.out.println();
            System.out.println(doc.mostraDoc());
        }
        sc.close();
    }
}
