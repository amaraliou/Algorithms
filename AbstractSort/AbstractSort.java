import java.io.*;
import java.util.*;

public abstract class AbstractSort{

    protected String name;

    public AbstractSort(String name){
        this.name = name;
    }

    public abstract void sort();
}