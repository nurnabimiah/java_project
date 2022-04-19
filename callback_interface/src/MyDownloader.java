

public class MyDownloader {

    public void startDownload(MyDownloadListener listener)
    {
        System.out.println("Downloading.....");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    listener.OnDownloadCompleted("Download completed !!!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }


}

