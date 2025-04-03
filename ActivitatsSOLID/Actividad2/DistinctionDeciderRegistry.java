package Actividad2;

import java.util.*;

public class DistinctionDeciderRegistry {
    private List<DistinctionDecider> deciders = new ArrayList<>();

    public void register(DistinctionDecider decider) {
        deciders.add(decider);
    }

    public List<DistinctionDecider> getDeciders() {
        return deciders;
    }
}