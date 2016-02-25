import java.io.*;

class Wc {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArgumentSeperator arguments = new ArgumentSeperator(args);
        String[] fileNames = arguments.getFileNames();
        String[] options = arguments.getOptions();
        int[] optionArraySize = (options.length > 0) ? new int[options.length] : new int[3];
        Accumulator adder = new Accumulator(optionArraySize);

        for (int index = 0; index < fileNames.length; index++) {
            File fl = new File(fileNames[index]);
            if (fl.isFile()) {
                InputStream is = new FileInputStream(fl);
                int size = is.available();
                String data = "";
                for (int i = 0; i < size; i++)
                    data += (char) is.read();
                Executor ex = new Executor(options, data);
                int[] result = ex.getExecutedCount();
                adder.add(result);
                System.out.println("\t" + ex.toString() + "   " + fileNames[index]);
            }
            else if (fl.isDirectory())
                System.out.println("wc: " + fileNames[index] + ": read: Is a directory");
            else
                System.out.println("wc: " + fileNames[index] + ": open: No such file or directory");
        }
        if (fileNames.length > 1)
            System.out.println("\t" + adder.toString() + "   Total");

    }
}
