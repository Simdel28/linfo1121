import java.util.*;

public class E1Q2 {
    /**
     * Etant donné une liste de relations entre des gares (le train démarre de la gare `from` au temps `startTime`
     * et arrive à la gare `to` au temps `endTime`) et les positions des gares, ainsi qu'une gare et un temps de départ,
     * quelle est la gare la plus éloignée que vous pouvez atteindre avant (<=) le temps maxTime?
     *
     * Il n'y a pas à vous inquiéter de plusieurs points:
     * - les voyageurs peuvent repartir au moment exact où ils arrivent en gare;
     * - toutes les liaisons sont directes;
     * - les horaires ne sont pas périodiques, pas besoin de les répeter chaque jour.
     * - dans tout les cas, startTime < endTime et from != to dans les relations.
     * - il n'y a jamais de doublons (i.e. deux raltions strictement égales)
     *
     * Utilisez la fonction `distance` pour calculer la distance entre deux gares.
     *
     * La question est évaluée sur 20:
     * - 13 points si l'algorithme fonctionne
     * - 4 points si l'algorithme fonctionne rapidement (complexité raisonnable)
     * - 3 points supplémentaire si l'algorithme fonctionne très rapidement (complexité optimale)
     *
     * Nous laissons les termes complexité raisonnable/optimale volontairement flou. A vous, sur la base de vos
     * connaissance, de trouver parmi la famille d'algorithme approprié lequel est optimal.
     *
     * Un indice: vous l'aurez deviné, il s'agit clairement d'un problème de graphe. Mais pas n'importe quelle graphe:
     * les noeuds sont particuliers, car ils ne représentent pas un emplacement dans l'espace, mais un emplacement
     * dans l'espace temps (par exemple (Bruxelles-midi, 08h48)).
     *
     * N'oubliez pas que si j'arrive à Bxl-midi au temps i, je peux prendre n'importe quel train partant de Bxl-midi
     * partant au temps j >= i.
     *
     * By the way, saviez-vous que la fonction TreeMap.subMap (https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html#subMap-K-boolean-K-boolean-)
     * existe?
     *
     * @param relations une liste de relations, liant, une gare+un temps (la clé) (par exemple, Bxl-midi, 12h43)
     *                  à une liste de trains partant à ce moment là, représenté par une liste d'objet StationTime
     *                  indiquant à quelle endroit/heure arrivent ces trains.
     *
     *                  Les gares sont représentées par des String ("Bxl-midi") et le temps par des entiers positifs.
     * @param stationPositions la position des gares
     * @param startPoint l'endroit/temps d'où l'on démarre
     * @param maxTime le dernier moment où l'on peut arriver à la gare de destination
     * @return la gare la plus lointaine atteignable en partant de startPoint avant le temps maxTime.
     */
    public static String farthestPointReachable(HashMap<StationTime, LinkedList<StationTime>> relations, Map<String, Position> stationPositions,
                                                StationTime startPoint, int maxTime) {
        //TODO
        return null;
    }
}
