package Interface1;

interface Compressor {
    void compress(String fileName);
    double getCompressionRatio();
}

class ZipCompressor implements Compressor {
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using ZIP...");
    }

    public double getCompressionRatio() {
        return 1.8;
    }
}

class RarCompressor implements Compressor {
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using RAR...");
    }

    public double getCompressionRatio() {
        return 2.1;
    }
}

 class CompressionDemo {
    public static void main(String[] args) {
        Compressor compressor = new ZipCompressor(); // or new RarCompressor();
        compressor.compress("Report.docx");
        System.out.println("Compression Ratio: " + compressor.getCompressionRatio());
    }
}
