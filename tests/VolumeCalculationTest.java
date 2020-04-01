import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;

public class VolumeCalculationTest {

    private DecimalFormat df2 = new DecimalFormat("#.##");

    @Test
    public void testvolumeofcube() {
        assertEquals(1, VolumeCalculation.volume_of_cube(1));
        assertEquals(125, VolumeCalculation.volume_of_cube(5));
        assertEquals(1000, VolumeCalculation.volume_of_cube(10));
        assertEquals(3375, VolumeCalculation.volume_of_cube(15));
        assertEquals(8000, VolumeCalculation.volume_of_cube(20));
    }

    @Test
    public void testvolumeoftethedron() {
        assertEquals(0.12, Double.parseDouble((df2.format(VolumeCalculation.volume_of_tetrahedron(1)))));
        assertEquals(14.73, Double.parseDouble((df2.format(VolumeCalculation.volume_of_tetrahedron(5)))));
        assertEquals(117.85, Double.parseDouble((df2.format(VolumeCalculation.volume_of_tetrahedron(10)))));
        assertEquals(397.75, Double.parseDouble((df2.format(VolumeCalculation.volume_of_tetrahedron(15)))));
        assertEquals(942.81, Double.parseDouble((df2.format(VolumeCalculation.volume_of_tetrahedron(20)))));
    }

    @Test
    public void testvolumeofsphere() {
        assertEquals(4.19, Double.parseDouble((df2.format(VolumeCalculation.volume_of_sphere(1)))));
        assertEquals(523.6, Double.parseDouble((df2.format(VolumeCalculation.volume_of_sphere(5)))));
        assertEquals(4188.79, Double.parseDouble((df2.format(VolumeCalculation.volume_of_sphere(10)))));
        assertEquals(14137.17, Double.parseDouble((df2.format(VolumeCalculation.volume_of_sphere(15)))));
        assertEquals(33510.32, Double.parseDouble((df2.format(VolumeCalculation.volume_of_sphere(20)))));
    }
}