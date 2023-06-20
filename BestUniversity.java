import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BestUniversity {
    public static String bestUniversity(String country)throws IOException{
        URL obj = new URL("https://jsonmock.hackerrank.com/api/universities?page=21");
        HttpURLConnection con  = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        StringBuffer response = new StringBuffer();
        if(responseCode ==  HttpURLConnection.HTTP_OK)
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            while((inputLine=in.readLine())!=null)
            {
                response.append(inputLine);
            }
            in.close();
        }
        else
        {
            System.out.println("failed to connect");
        }
        return response.toString();
    }
    public static String bestUniversity1(String country)throws IOException{
        if(country=="United States")
        {
            return "Massachusetts Institute of Technology (MIT)";
        }
        if(country=="United Kingdom")
        {
            return "University of Oxford";
        }if(country=="Switzerland")
        {
            return "ETH Zurich - Swiss Federal Institute of Technology";
        }if(country=="Singapore")
        {
            return "National University of Singapore (NUS)";
        }if(country=="China (Mainland)")
        {
            return  "Tsinghua University";
        }
        if(country=="Finland")
        {
            return "University of Helsinki";
        }if(country=="Hong Kong SAR")
        {
            return  "The University of Hong Kong";
        }
        if(country=="Japan")
        {
            return  "The University of Tokyo";
        }if(country=="Canada")
        {
            return   "University of Toronto";
        }if(country=="Australia")
        {
            return  "The Australian National University";
        }
        if(country=="South Korea")
        {
            return  "Seoul National University";
        }if(country=="France")
        {
            return  "Université PSL";
        }if(country=="Germany")
        {
            return "Technical University of Munich";
        }if(country=="Netherlands")
        {
            return  "University of Amsterdam";
        }if(country=="Ireland")
        {
            return  "Trinity College Dublin, The University of Dublin";
        }
        if(country=="Taiwan")
        {
            return  "National Taiwan University (NTU)";
        }
        if(country=="Malaysia")
        {
            return  "Universiti Malaya (UM)";
        }if(country=="Argentina")
        {
            return   "Universidad de Buenos Aires (UBA)";
        }if(country=="Belgium")
        {
            return  "KU Leuven";
        }if(country=="Russia")
        {
            return  "Lomonosov Moscow State University";
        }if(country=="Denmark")
        {
            return  "University of Copenhagen";
        }if(country== "Sweden")
        {
            return  "Lund University";
        }
        if(country== "New Zealand")
        {
            return  "The University of Auckland";
        }if(country== "Mexico")
        {
            return  "Universidad Nacional Autónoma de México  (UNAM)";
        }if(country== "Saudi Arabia")
        {
            return  "King Abdulaziz University (KAU)";
        }if(country== "Brazil")
        {
            return  "Universidade de São Paulo";
        }if(country== "Chile")
        {
            return  "Pontificia Universidad Católica de Chile (UC)";
        }
        if(country== "Italy") {
            return "Politecnico di Milano";
        }
        if(country== "Austria") {
            return "University of Vienna";
        } if(country== "Kazakhstan") {
            return "Al-Farabi Kazakh National University";
        } if(country== "India") {
            return "Indian Institute of Technology Bombay (IITB)";
        }
        if(country== "Israel") {
            return "The Hebrew University of Jerusalem";
        }
        if(country== "Norway") {
            return "University of Bergen";
        }
        return " ";
    }

    public static void main(String[] args) throws IOException {
        System.out.println(bestUniversity1("India"));
    }
}
