public class ConfigGenerator {
    public static void writeFile(
        HostVM[] hosts,
        DmzFwVM[] firewalls,
        HubNode[] hubs,
        Wire[] wires,
        String path) {
        String outputText = "";
        for (hostVM node : hosts) {
            outputText += "vm " + node.getName() + " {\n" +
            "        os : " + node.getOs() + "\n" +
            "        ver : \"" + node.getVer() + "\"\n" +
            "        src : \"" + node.getSrc() + "\"\n" +
            //TODO: Handle Eth addresses

            "}\n\n";
        }

        //Write the string we just created to a file
        //Based to tutorial from  https://howtodoinjava.com/java/io/java-write-to-file/
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        writer.write(outputText);
        writer.close();
        return;
    }
}