package generic;

public class GenericSample {
    public static void main(String[] args) {
        GenericSample sample = new GenericSample();
        sample.checkCastingDTO();
        sample.checkGenericDTO();
    }

    public void checkGenericDTO() {
        CastingGenericDTO<String> dto1 = new CastingGenericDTO<>();
        dto1.setObject(new String());
        CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<>();
        dto2.setObject(new StringBuffer());
        CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<>();
        dto3.setObject(new StringBuilder());

        String temp1 = dto1.getObject();
        StringBuffer temp2 = dto2.getObject();
        StringBuilder temp3 = dto3.getObject();
    }

    public void checkCastingDTO() {
        CastingDTO dto1 = new CastingDTO();
        dto1.setObject(new String());

        CastingDTO dto2 = new CastingDTO();
        dto2.setObject(new StringBuffer());

        CastingDTO dto3 = new CastingDTO();
        dto3.setObject(new StringBuilder());

        String temp1 = (String)dto1.getObject(); //return 타입이 Object이므로 형변환 필요
        StringBuffer temp2 = (StringBuffer) dto2.getObject();
        StringBuilder temp3 = (StringBuilder) dto3.getObject();
        /* 넘어온 Object객체의 타입이 String 인지, StringBuffer인지 .. 알수있는 방법이 있어? --> instanceof 사용*/
    }

    public void checkDTO(CastingDTO dto) {
        Object tempObject = dto.getObject();
        if(tempObject instanceof StringBuilder) {
            System.out.println("StringBuilder");
        }
        else if(tempObject instanceof StringBuilder) {
            System.out.println("StringBuffer");
        }
    }

}
