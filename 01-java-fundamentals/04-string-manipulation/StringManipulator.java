public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        return(str1.trim() + str2.trim());
    }

    public Integer getIndexOrNull(String str1, String str2){
        return(str1.indexOf(str2));
    }

    public String concatSubstring(String str1, int indexStart, int indexEnd, String str2) {
        return(str1.substring(indexStart, indexEnd).concat(str2));
    }
}

