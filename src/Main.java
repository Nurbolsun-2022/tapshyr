import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
            public static void main(String[] args) throws IOException {
                write("Керим Турапов", "Туулган жерди сагынуу");
                System.out.println(read());

            }
            public static void write(String title, String author) throws IOException {
                FileWriter fileWriter = new FileWriter("Song.txt");
                fileWriter.write(title + "\n");
                fileWriter.write(author + "\n");
                fileWriter.write("                Кылымдардан кылым карытып,\n" +
                        "                Кызыл-Суунун суусу агылып.\n" +
                        "                Бал жыттанган таттуу кымыздай,\n" +
                        "                Туулган жердин суусун сагындым.\n" +
                        "                Жүрсөм дагы алыс араңдан,\n" +
                        "                \"Ата Журтум кетпейт санаамдан.\\n\" +\n" +
                        "                \"Акыл айтып, асыл кеп айткан,\\n\" +\n" +
                        "                \"Аталардын кебин сагынам.\\n\" +\n" +
                        "                \"Сары-Ой менен Көк-Ой тоосунан,\\n\" +\n" +
                        "                \"Бүркүт шаңшып, күкүк сайраган.\\n\" +\n" +
                        "                \"Ышкын терип аска-зоосунан,\\n\" +\n" +
                        "                \"Жүргөн күнүм эстеп сагынам.\\n\" +\n" +
                        "                \"Жылаңайлак, чырпык ат минип,\\n\" +\n" +
                        "                \"Жылгалардан тунук суу кечип.\\n\" +\n" +
                        "                \"Балтырымды тилип караган,\\n\" +\n" +
                        "                \"Балалыгым эстеп сагынам.\\n\" +\n" +
                        "                \"Коңур-Дөбө — жайлоо, жашыл төр,\\n\" +\n" +
                        "                \"Коңур желдүү, салкын, асыл жер.\\n\" +\n" +
                        "                \"Кокту, белес, күнгөй-тескейден,\\n\" +\n" +
                        "                \"Кой кайтарган күнүм сагынам.\\n\" +\n" +
                        "                \"Түндүгүнөн түтүн булатып,\\n\" +\n" +
                        "                \"Апам жапкан нанды сагынам.\\n\" +\n" +
                        "                \"Үйүр-үйүр жылкы айдаган,\\n\" +\n" +
                        "                \"Атам жүргөн жерди сагынам.\\n\" +\n" +
                        "                \"Үйүр-үйүр жылкы айдаган,\\n\" +\n" +
                        "                \"Атам конгон журтту сагынам.");
                fileWriter.close();
            }

            public static Song read() throws IOException, FileNotFoundException {
                FileReader fileReader = new FileReader("Song.txt");
                Scanner scanner = new Scanner(fileReader);
                Song song = new Song();
                StringBuilder stringBuilder = new StringBuilder();
                song.setTitle(song.getTitle());
                song.setAuthor(song.getAuthor());
                while (scanner.hasNextLine()) {
                    stringBuilder.append(scanner.nextLine()+"\n");
                }
                song.setText(stringBuilder.toString());
                fileReader.close();

                return song;
            }
        }