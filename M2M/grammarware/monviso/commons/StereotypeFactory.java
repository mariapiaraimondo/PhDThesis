package monviso.commons;

public class StereotypeFactory {

	public static StereotypeKind getStereotype(Direction dir) {
		StereotypeKind retval = StereotypeKind.None;
		if (dir == Direction.Input) {
			retval = StereotypeKind.InputAsset;
		}
		if (dir == Direction.Output) {
			retval = StereotypeKind.OutputAsset;
		}
		return retval;
	}
}
