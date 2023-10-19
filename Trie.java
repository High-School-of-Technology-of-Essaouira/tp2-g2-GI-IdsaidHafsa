class Trie {
    public void static main(String[] args) {
        int[] arr=new int[];
        int temp;
        Scanner input=new Scanner(System.in);
        System.out.println("Entrer la taille du tableau: ");
        int n=input.nextInt();
        int num;
        for(int i=0;i<n;i++) {
            System.out.println("Entrer un nombre: ");
            num=input.nextInt();
            arr[i]=num;
        }
    }
    public int[] static bubleSort(int[] arr) {
        for(int i=0;i<arr.length();i++) {
            for(int j=0;j<arr.length();i++) {
                if(arr[i+1] < arr[i]) {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        return arr;
    }
}