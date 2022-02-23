class BlankSpace {
    public static void main(String[] args)
    {
        String str = "      Christian     jade    Paras        ";
       
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
       
        System.out.println(str);
    }
}