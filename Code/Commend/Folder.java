package Commend;

public class Folder {
    String folderName;
    Folder childFolder[];
    File files[];
    int noOfFolders, noOfFiles;
    Folder parentFolder;
    
    Folder() {
        folderName = null;
        parentFolder = null;
        childFolder = new Folder[3];
        files = new File[3];
        noOfFolders = 0;
        noOfFiles = 0;
    }

    Folder(String folderName){
        this.folderName = folderName;
        childFolder = new Folder[3];
        files = new File[3];
        noOfFolders = 0;
        noOfFiles = 0;
    }

    Folder(String folderName, Folder parentFolder){
        this.folderName = folderName;
        childFolder = new Folder[3];
        files = new File[3];
        noOfFolders = 0;
        this.parentFolder = parentFolder;
    }


    public void mkdir(String folderName){
        if(noOfFolders == 3){
            System.out.println("This folder is full");
        }
        else{
            childFolder[noOfFolders] = new Folder(folderName, this);
            noOfFolders++;
            System.out.println("Folder is created: "+folderName);
        }
    }

    public void touch(String fileName){
        if(noOfFiles == 3){
            System.out.println("This folder is full");
        }
        else{
            files[noOfFiles] = new File(fileName, this);
            System.out.println("File is created: "+ fileName );
            System.out.println(files[noOfFiles].content);
            noOfFiles++;
        }
    }
    
    public void ls(){
            for(int i=0 ; i<noOfFolders; i++)
            System.out.println("Folder: " + childFolder[i].folderName);
            for(int i=0 ; i<noOfFiles; i++)
            System.out.println("File: " + files[i].fileName);
    }

    public Folder cd(String folderName){
        System.out.println(folderName);
        int firstSlashOccurance = folderName.indexOf('/');
        if(firstSlashOccurance != -1 ){
            if(folderName.substring(0, firstSlashOccurance).equals("..") ){
                parentFolder.cd(folderName.substring(firstSlashOccurance+1));
            }
            // if(folderName.substring(0, firstSlashOccurance).equals("$")){
            //     return parentFolder.cd(folderName.substring(firstSlashOccurance+1));
            // }
            for(int i=0; i<noOfFolders; i++){
                if(folderName.substring(0, firstSlashOccurance).equals(childFolder[i].folderName)){
                    System.out.println("You are in folder " + childFolder[i].folderName);
                    return childFolder[i].cd(folderName.substring(firstSlashOccurance+1));
                }
            }
            System.out.println("There is no such folder");
            return this;
        } else if (folderName.equals("..")) {
            return parentFolder;
        } else if (folderName.equals("")) {
            return this;
        }
        for(int i=0; i<noOfFolders; i++){
            if(folderName.equals(childFolder[i].folderName)){
                System.out.println("You are in folder " + childFolder[i].folderName);
                return childFolder[i];
            }
        }
        System.out.println("There is no such folder");
        return this;
    }

}
class File{
    String fileName;
    String content;
    Folder parentFolder;

    File(){
        fileName = null;
        content = null;
    }
    File(String fileName){
        this.fileName = fileName;
        content = "file one is created successfully";
    }
    File(String fileName, Folder parentFolder){
        this.fileName = fileName;
        content = "file one is created successfully";
        this.parentFolder = parentFolder;

    }
}

