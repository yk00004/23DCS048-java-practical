public class pr29 {
    public static void main(String[] args) {
        int primitiveInt = 5;
        Integer wrapperInt = primitiveInt; 

        int unboxedInt = wrapperInt; 

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Unboxed int: " + unboxedInt);

        String binaryString = Integer.toBinaryString(wrapperInt);
        System.out.println("Binary representation of " + wrapperInt + ": " + binaryString);
    }
}