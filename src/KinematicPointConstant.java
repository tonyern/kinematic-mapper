import java.awt.*;

/**
 * Class that represents a location that does not change with time.
 * These points are fixed on screen.
 *
 * @author Tony Nguyen
 * @version 2.0
 */
public class KinematicPointConstant extends KinematicPointAbstract {
    /**
     * PointND value
     */
    private PointND point;

    /**
     * Default constructor for KinematicPointConstant.
     *
     * @param color Color of the line.
     * @param width Width of the line.
     * @param x     X value on the coordinates.
     * @param y     Y value on the coordinates.
     * @param z     Z value on the coordinates.
     */
    public KinematicPointConstant(Color color, float width, double x, double y, double z) {
        // Gets info from the parent class.
        super(color, width);
        // Gets the x, y, z points.
        point = new PointND();
        point.add("x", new GeneralValue(x));
        point.add("y", new GeneralValue(y));
        point.add("z", new GeneralValue(z));
    }

    /**
     * Gets the GeneralValue coordinates of the corresponding subfield in the current state.
     *
     * @param state          Current state.
     * @param screenSubfield Subfield we are looking for.
     * @return screenValueCoordinate The GeneralValue corresponding to the subfield.
     */
    public GeneralValue getScreenCoordinate(State state, String screenSubfield) {
        point = state.getPoint(screenSubfield);
        GeneralValue screenValueCoordinate = point.getValue(screenSubfield);
        return screenValueCoordinate;
    }
}