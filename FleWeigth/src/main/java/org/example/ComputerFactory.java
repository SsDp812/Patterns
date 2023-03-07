package org.example;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;

public class ComputerFactory {
    private HashMap<ComputerType,IComputer> computers = new HashMap<>();

    public IComputer getComputer(ComputerType type){
        if(computers.containsKey(type)){
            return computers.get(type);
        }
        IComputer computer = createComputer(type);
        computers.put(type,computer);
        return computer;
    }
    private IComputer createComputer(ComputerType type){
        IComputer computer = null;
        switch (type){
            case PC:
                computer = new PC();
                break;
            case laptop:
                computer = new laptop();
                break;
        }
        return computer;
    }

}
