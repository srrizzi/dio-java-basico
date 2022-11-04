import javax.swing.*;
import java.io.*;

public class CheckedException
{
    //  Imprimir um arquivo no console.
    public static void main(String[] args) throws IOException
    {
        String nomeDoArquivo = "text.txt";

        try
        {
            imprimirArquivoNoConsole(nomeDoArquivo);
        }
        catch (FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo que voce deseja imprimir! " + e.getCause());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado! Entre em contato com o suporte! " + e.getCause());
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Continua...");
        }


        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    private static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException
    {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do
        {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while (line != null);
        bw.flush();
        br.close();
    }


}
