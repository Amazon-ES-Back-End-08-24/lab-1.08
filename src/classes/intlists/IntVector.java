package classes.intlists;

public class IntVector implements IntList {
    private Integer[] array;

    public IntVector() {
        array = new Integer[20];
        System.out.println("init " + array.length);
    }

    public void add(int value) {
        boolean hasBeenAdded = false;

        for (int i = 0; i < array.length; i++) {
            // Valida si tiene una posición vacía en el array
            if (array[i] == null) {
                array[i] = value;
                hasBeenAdded = true;
                break;
            }
        }

        // Valida si el item ya se había añadido
        if (!hasBeenAdded) {
            System.out.println("Update size " + array.length);

            // calcula el nuevo tamaño
            int newLength = array.length + array.length / 2;

            // nuevo array
            Integer[] newArray = new Integer[newLength];

            // Rellena el nuevo array con los valores del viejo
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }

            // Rellena el nuevo array con los valores del viejo
            array = newArray;
        }

    }

    public int get(int id) {
        return array[id];
    }
}
