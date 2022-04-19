


public class MainClass {
    public static void main(String[] args) {
        MyDownloader myDownloader = new MyDownloader();
        myDownloader.startDownload(new MyDownloadListener() {
            @Override
            public void OnDownloadCompleted(String message) {
                System.out.println(message);
            }
        });


    }
}
