public class Inheritance {

    class Box {
        double l, w, h;

        Box() {
            this.l = -1;
            this.h = -1;
            this.w = -1;
        }

        // Cube
        Box (double side) {
            this.l = side;
            this.w = side;
            this.h = side;
        }
        
        Box (double l, double w, double h) {
            this.l = l;
            this.w = w;
            this.h = w;
        }

        Box ( Box old) {
            this.l = old.l;
            this.w = old.w;
            this.h = old.h;
        }

    }

    class BoxWeight extends Box {
        double weight;

        public BoxWeight(double l, double w, double h, double weight) {
            super(l, w, h);
            this.weight = weight;
        }

        public BoxWeight() {
            this.weight = -1;
        }

        BoxWeight (BoxWeight other) {
            super(other);
            weight = other.weight;
        }

        
    }
    


    public static void main(String[] args) {
        
    }
}
