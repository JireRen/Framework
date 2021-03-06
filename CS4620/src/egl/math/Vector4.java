package egl.math;
import java.util.AbstractList;

/**
 * A 4-Component Vector
 * <br>Single Precision</br>
 * <pre>
 *  Argument Usage Identifiers:
 * [POS]  - Position
 * [OFF]  - Offset Between Positions
 * [DIR]  - Normalized Direction
 * [DIRN] - Direction (Scale Allowable)
 * [ARR]  - Array Of Floats
 * [OUT]  - Non-Null Output
 * </pre>
 * @author Cristian
 *
 */
public class Vector4 extends AbstractList<Float> implements Cloneable {
	public static final int NUM_COMPONENTS = 4;
	
	/** 
	 * Coordinate Component Of The Vector
	 */
	public float x, y, z, w;

	/**
	 * Inline Constructor
	 * @param _x X Coordinate
	 * @param _y Y Coordinate
	 * @param _z Z Coordinate
	 * @param _w W Coordinate
	 */
	public Vector4(float _x, float _y, float _z, float _w) {
		x = _x;
		y = _y;
		z = _z;
		w = _w;
	}
	/**
	 * Copy Constructor
	 * @param v Vector
	 */
	public Vector4(Vector4 v) {
		this(v.x, v.y, v.z, v.w);
	}
	/**
	 * Uniform Value Constructor
	 * @param f Value
	 */
	public Vector4(float f) {
		this(f, f, f, f);
	}
	/**
	 * Zero Vector Constructor
	 */
	public Vector4() {
		this(0);
	}

	@Override
	public String toString() {
		return "{"+x+", "+y+", "+z+", "+w+"}f";
	}
	
	/**
	 * Inline Setter
	 * @param _x X Coordinate
	 * @param _y Y Coordinate
	 * @param _z Z Coordinate
	 * @param _w W Coordinate
	 * @return This
	 */
	public Vector4 set(float _x, float _y, float _z, float _w) {
		x = _x;
		y = _y;
		z = _z;
		w = _w;
		return this;
	}
	/**
	 * Set This Vector To The Zero Vector
	 * @return This
	 */
	public Vector4 setZero() {
		return set(0);
	}
	/**
	 * Set This Vector To Uniform Values
	 * @param f Value
	 * @return This
	 */
	public Vector4 set(float f) {
		return set(f, f, f, f);
	}
	/**
	 * Copy Vector Into This Vector
	 * @param v Vector
	 * @return This
	 */
	public Vector4 set(Vector4 v) {
		return set(v.x, v.y, v.z, v.w);
	}
	/**
	 * Sets This Vector To A Multiple Of XYZ Components
	 * <pre>
	 * This = s * {_x, _y, _z, _w}
	 * </pre>
	 * @param s Scalar
	 * @param _x X Component
	 * @param _y Y Component
	 * @param _z Z Component
	 * @param _w W Component
	 * @return This
	 */
	public Vector4 setMultiple(float s, float _x, float _y, float _z, float _w) {
		x = s * _x;
		y = s * _y;
		z = s * _z;
		w = s * _w;
		return this;
	}
	/**
	 * Sets This Vector To A Multiple Of Another
	 * <pre>
	 * This = s * v
	 * </pre>
	 * @param s Scalar
	 * @param v Vector
	 * @return This
	 */
	public Vector4 setMultiple(float s, Vector4 v) {
		return setMultiple(s, v.x, v.y, v.z, v.w);
	}

	/**
	 * In-Place Addition
	 * <pre>
	 * This = This + {_x, _y, _z, _w}
	 * </pre>
	 * @param _x X Component
	 * @param _y Y Component
	 * @param _z Z Component
	 * @param _w W Component
	 * @return This
	 */
	public Vector4 add(float _x, float _y, float _z, float _w) {
		x += _x;
		y += _y;
		z += _z;
		w += _w;
		return this;
	}
	/**
	 * In-Place Addition
	 * <pre>
	 * This = This + v
	 * </pre>
	 * @param v Vector
	 * @return This
	 */
	public Vector4 add(Vector4 v) {
		return add(v.x, v.y, v.z, v.w);
	}
	/**
	 * In-Place Uniform Addition
	 * <pre>
	 * This = This + {f, f, f}
	 * </pre>
	 * @param f Value
	 * @return This
	 */
	public Vector4 add(float f) {
		return add(f, f, f, f);
	}
	/**
	 * Sets This Vector To The Sum Of Two Vectors
	 * <pre>
	 * This = v1 + v2
	 * </pre>
	 * @param v1 Vector
	 * @param v2 Vector
	 * @return This
	 * /
	public Vec3 add(Vec3 v1, Vec3 v2) {
		return set(v1).add(v2);
	}*/
	/**
	 * In-Place Scaled Addition
	 * <pre>
	 * This = This + s * {_x, _y, _z, _w}
	 * </pre>
	 * @param s Scalar
	 * @param _x X Component
	 * @param _y Y Component
	 * @param _z Z Component
	 * @param _w W Component
	 * @return This
	 */
	public Vector4 addMultiple(float s, float _x, float _y, float _z, float _w) {
		x += s * _x;
		y += s * _y;
		z += s * _z;
		w += s * _w;
		return this;
	}
	/**
	 * In-Place Scaled Addition
	 * <pre>
	 * This = This + s * v
	 * </pre>
	 * @param s Scalar
	 * @param v Vector
	 * @return This
	 */
	public Vector4 addMultiple(float s, Vector4 v) {
		return addMultiple(s, v.x, v.y, v.z, v.w);
	}
	
	/**
	 * In-Place Subtraction
	 * <pre>
	 * This = This - {_x, _y, _z, _w}
	 * </pre>
	 * @param _x X Component
	 * @param _y Y Component
	 * @param _z Z Component
	 * @param _w W Component
	 * @return This
	 */
	public Vector4 sub(float _x, float _y, float _z, float _w) {
		x -= _x;
		y -= _y;
		z -= _z;
		w -= _w;
		return this;
	}
	/**
	 * In-Place Subtraction
	 * <pre>
	 * This = This - v
	 * </pre>
	 * @param v Vector
	 * @return This
	 */
	public Vector4 sub(Vector4 v) {
		return sub(v.x, v.y, v.z, v.w);
	}
	/**
	 * In-Place Uniform Subtraction
	 * <pre>
	 * This = This - {f, f, f}
	 * </pre>
	 * @param f Value
	 * @return This
	 */
	public Vector4 sub(float f) {
		return sub(f, f, f, f);
	}
	/**
	 * Sets This Vector To The Difference Of Two Vectors
	 * <pre>
	 * This = v1 - v2
	 * </pre>
	 * @param v1 Vector
	 * @param v2 Vector
	 * @return This
	 * /
	public Vec3 sub(Vec3 v1, Vec3 v2) {
		return set(v1).sub(v2);
	}*/
	/**
	 * In-Place Scaled Subtraction
	 * <pre>
	 * This = This - s * {_x, _y, _z, _w}
	 * </pre>
	 * @param s Scalar
	 * @param _x X Component
	 * @param _y Y Component
	 * @param _z Z Component
	 * @param _w W Component
	 * @return This
	 */
	public Vector4 subMultiple(float s, float _x, float _y, float _z, float _w) {
		x -= s * _x;
		y -= s * _y;
		z -= s * _z;
		w -= s * _w;
		return this;
	}
	/**
	 * In-Place Scaled Subtraction
	 * <pre>
	 * This = This - s * v
	 * </pre>
	 * @param s Scalar
	 * @param v Vector
	 * @return This
	 */
	public Vector4 subMultiple(float s, Vector4 v) {
		return subMultiple(s, v.x, v.y, v.z, v.w);
	}
	
	/**
	 * In-Place Multiplication
	 * <pre>
	 * This = This * {_x, _y, _z, _w}
	 * </pre>
	 * @param _x X Component
	 * @param _y Y Component
	 * @param _z Z Component
	 * @param _w W Component
	 * @return This
	 */
	public Vector4 mul(float _x, float _y, float _z, float _w) {
		x *= _x;
		y *= _y;
		z *= _z;
		w *= _w;
		return this;
	}
	/**
	 * In-Place Multiplication
	 * <pre>
	 * This = This * v
	 * </pre>
	 * @param v Vector
	 * @return This
	 */
	public Vector4 mul(Vector4 v) {
		return mul(v.x, v.y, v.z, v.w);
	}
	/**
	 * In-Place Uniform Multiplication
	 * <pre>
	 * This = This * {f, f, f}
	 * </pre>
	 * @param f Value
	 * @return This
	 */
	public Vector4 mul(float f) {
		return mul(f, f, f, f);
	}
	/**
	 * Sets This Vector To The Product Of Two Vectors
	 * <pre>
	 * This = v1 * v2
	 * </pre>
	 * @param v1 Vector
	 * @param v2 Vector
	 * @return This
	 * /
	public Vec3 mul(Vec3 v1, Vec3 v2) {
		return set(v1).mul(v2);
	}*/

	/**
	 * In-Place Division
	 * <pre>
	 * This = This / {_x, _y, _z, _w}
	 * </pre>
	 * @param _x X Component
	 * @param _y Y Component
	 * @param _z Z Component
	 * @param _w W Component
	 * @return This
	 */
	public Vector4 div(float _x, float _y, float _z, float _w) {
		x /= _x;
		y /= _y;
		z /= _z;
		w /= _w;
		return this;
	}
	/**
	 * In-Place Division
	 * <pre>
	 * This = This / v
	 * </pre>
	 * @param v Vector
	 * @return This
	 */
	public Vector4 div(Vector4 v) {
		return div(v.x, v.y, v.z, v.w);
	}
	/**
	 * In-Place Uniform Division
	 * <pre>
	 * This = This * {1 / f, 1 / f, 1 / f, 1 / f}
	 * </pre>
	 * @param f Value
	 * @return This
	 */
	public Vector4 div(float f) {
		return mul(1 / f);
	}
	/**
	 * Sets This Vector To The Quotient Of Two Vectors
	 * <pre>
	 * This = v1 / v2
	 * </pre>
	 * @param v1 Vector
	 * @param v2 Vector
	 * @return This
	 * /
	public Vec3 div(Vec3 v1, Vec3 v2) {
		return set(v1).div(v2);
	}*/

	/**
	 * In-Place Power
	 * <pre>
	 * This = This ^ {_x, _y, _z, _w}
	 * </pre>
	 * @param _x X Component
	 * @param _y Y Component
	 * @param _z Z Component
	 * @param _w W Component
	 * @return This
	 */
	public Vector4 pow(float _x, float _y, float _z, float _w) {
		x = (float)Math.pow(x, _x);
		y = (float)Math.pow(y, _y);
		z = (float)Math.pow(z, _z);
		w = (float)Math.pow(w, _w);
		return this;
	}
	/**
	 * In-Place Power
	 * <pre>
	 * This = This ^ v
	 * </pre>
	 * @param v Vector
	 * @return This
	 */
	public Vector4 pow(Vector4 v) {
		return pow(v.x, v.y, v.z, v.w);
	}
	/**
	 * In-Place Uniform Power
	 * <pre>
	 * This = This ^ {f, f, f, f}
	 * </pre>
	 * @param f Value
	 * @return This
	 */
	public Vector4 pow(float f) {
		return pow(f, f, f, f);
	}
	
	/**
	 * In-Place Exponentiation
	 * <pre>
	 * This = {_x, _y, _z, _w} ^ This
	 * </pre>
	 * @param _x X Component
	 * @param _y Y Component
	 * @param _z Z Component
	 * @param _w W Component
	 * @return This
	 */
	public Vector4 exp(float _x, float _y, float _z, float _w) {
		x = (float)Math.pow(_x, x);
		y = (float)Math.pow(_y, y);
		z = (float)Math.pow(_z, z);
		w = (float)Math.pow(_w, w);
		return this;
	}
	/**
	 * In-Place Exponentiation
	 * <pre>
	 * This = v ^ This
	 * </pre>
	 * @param v Vector
	 * @return This
	 */
	public Vector4 exp(Vector4 v) {
		return exp(v.x, v.y, v.z, v.w);
	}
	/**
	 * In-Place Uniform Exponentiation
	 * <pre>
	 * This = {f, f, f, f} ^ This
	 * </pre>
	 * @param f Value
	 * @return This
	 */
	public Vector4 exp(float f) {
		return exp(f, f, f, f);
	}
	
	/**
	 * In-Place Logarithm
	 * <pre>
	 * This = log[base = This]({_x, _y, _z, _w})
	 * </pre>
	 * @param _x X Component
	 * @param _y Y Component
	 * @param _z Z Component
	 * @param _w W Component
	 * @return This
	 */
	public Vector4 log(float _x, float _y, float _z, float _w) {
		x = (float)(Math.log(x) / Math.log(_x));
		y = (float)(Math.log(y) / Math.log(_y));
		z = (float)(Math.log(z) / Math.log(_z));
		w = (float)(Math.log(w) / Math.log(_w));
		return this;
	}
	/**
	 * In-Place Logarithm
	 * <pre>
	 * This = log[base = This](v)
	 * </pre>
	 * @param v Vector
	 * @return This
	 */
	public Vector4 log(Vector4 v) {
		return log(v.x, v.y, v.z, v.w);
	}
	/**
	 * In-Place Uniform Logarithm
	 * <pre>
	 * This = log[base = This]({f, f, f, f})
	 * </pre>
	 * @param f Value
	 * @return This
	 */
	public Vector4 log(float f) {
		return log(f, f, f, f);
	}
	
	/**
	 * In-Place Absolution
	 * @return This
	 */
	public Vector4 abs() {
		if(x < 0) x = -x;
		if(y < 0) y = -y;
		if(z < 0) z = -z;
		if(w < 0) w = -w;
		return this;
	}
	/**
	 * In-Place Negation
	 * @return This
	 */
	public Vector4 negate() {
		x = -x;
		y = -y;
		z = -z;
		w = -w;
		return this;
	}
	
	/**
	 * Calculates Dot Product Between This And Another
	 * @param v [{@link Vector4 ARR}] Vector
	 * @return Vector Dot Product
	 */
	public float dot(Vector4 v) {
		return x * v.x + y * v.y + z * v.z + w * v.w;
	}
	/**
	 * Calculates The Dot Product With Itself
	 * @return The Vector Length Squared
	 */
	public float lenSq() {
		return dot(this);
	}
	/**
	 * Calculates The Length
	 * @return The Vector Length
	 */
	public float len() {
		return (float)Math.sqrt(lenSq());
	}

	/**
	 * Calculates Distance Squared Between This Vector And Another
	 * <pre>
	 * Let off = This - v
	 * Ret dot(off, off)
	 * </pre>
	 * @param v [{@link Vector4 POS}] Vector
	 * @return Length Squared Of Offset Vector
	 */
	public float distSq(Vector4 v) {
		float ox = x - v.x;
		float oy = y - v.y;
		float oz = z - v.z;
		float ow = w - v.w;
		return ox * ox + oy * oy + oz * oz + ow * ow;
	}
	/**
	 * Calculates Distance Between This Vector And Another
	 * <pre>
	 * Let off = This - v
	 * Ret len(off)
	 * </pre>
	 * @param v [{@link Vector4 POS}] Vector
	 * @return Length Of Offset Vector
	 */
	public float dist(Vector4 v) {
		return (float)Math.sqrt(distSq(v));
	}
	/**
	 * Calculate Angle Between This Vector And Another
 	 * @param v [{@link Vector4 DIRN}] Vector
	 * @return Angle Between Vectors (Radians)
	 */
	public float angle(Vector4 v) {
		return (float)Math.acos(dot(v) / (len() * v.len()));
	}
	
	/**
	 * In-Place Normalization To Unit Length
	 * @return This
	 */
	public Vector4 normalize() {
		return mul(1 / len());
	}
	/**
	 * In-Place Homogenization By W-Component
	 * @return This
	 */
	public Vector4 homogenize() {
		x /= w;
		y /= w;
		z /= w;
		w = 1;
		return this;
	}

	/**
	 * In-Place Linear Interpolation Between This Vector And Another 
	 * <pre>
	 * This = (1 - r) * This + r * v
	 * </pre>
	 * @param v Vector
	 * @param r Ratio
	 * @return This
	 */
	public Vector4 lerp(Vector4 v, float r) {
		return mul(1 - r).addMultiple(r, v);
	}
	
	/**
	 * Checks Component Equality Between This Vector And Another
	 * @param v Vector
	 * @return True If All Components Equal
	 */
	public boolean equals(Vector4 v) {
		return x == v.x && y == v.y && z == v.z && w == v.w;
	}
	
	/**
	 * Checks Approximate Component Equality Between This Vector And Another
	 * @param v Vector
	 * @param epsilon Approximation Factor
	 * @return True If Maximum Difference Between Components Less Than epsilon In Magnitude
	 */
	public boolean equalsApprox(Vector4 v, float epsilon) {
		return Math.abs(x - v.x) < epsilon && Math.abs(y - v.y) < epsilon &&
				Math.abs(z - v.z) < epsilon && Math.abs(w - v.w) < epsilon;
	}
	
	/**
	 * Checks Approximate Component Equality Between This Vector And Another
	 * @param v Vector
	 * @return True If Maximum Difference Between Components Less Than 1e-5f In Magnitude
	 */
	public boolean equalsApprox(Vector4 v) {
		return equalsApprox(v, 1e-5f);
	}
	
	@Override
	public Float set(int index, Float element) {
		float oldVal;
		switch (index) {
		case 0:
			oldVal = x;
			x = element;
			return oldVal;
		case 1:
			oldVal = y;
			y = element;
			return oldVal;
		case 2:
			oldVal = z;
			z = element;
			return oldVal;
		case 3:
			oldVal = w;
			w = element;
			return oldVal;
		default: throw new IndexOutOfBoundsException();
		}
	}
	
	@Override
	public Float get(int index) {
		switch(index) {
		case 0: return x;
		case 1: return y;
		case 2: return z;
		case 3: return w;
		default: throw new IndexOutOfBoundsException();
		}
	}
	@Override
	public int size() {
		return NUM_COMPONENTS;
	}

	@Override
	public Vector4 clone() {
		return new Vector4(this);
	}
}

