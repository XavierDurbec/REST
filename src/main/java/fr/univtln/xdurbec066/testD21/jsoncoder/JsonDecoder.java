package fr.univtln.xdurbec066.testD21.jsoncoder;

/**
 * Created by xdurbec066 on 13/04/17.
 */
import com.fasterxml.jackson.databind.ObjectMapper;
import org.codehaus.jettison.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by clemzux on 25/08/16.
 */
public class JsonDecoder<T> {

    public T Decoder(String pJson, Class pType) throws IOException
    {
        return (T) new ObjectMapper().readValue(pJson, pType);
    }


    public List<T> DecoderList (String pJson, Class pType) throws IOException, JSONException
    {
        return new ObjectMapper().readValue(pJson, new ObjectMapper().getTypeFactory().constructCollectionType(ArrayList.class, pType));
    }
}