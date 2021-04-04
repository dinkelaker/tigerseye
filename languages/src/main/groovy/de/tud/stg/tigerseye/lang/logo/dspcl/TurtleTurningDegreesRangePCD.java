// ///////////////////////////////////////////////////////////////////////////////
// // Copyright 2009-2015, Technische Universitaet Darmstadt (TUD), Germany
// //
// // The TUD licenses this file to you under the Apache License, Version 2.0 (the
// // "License"); you may not use this file except in compliance
// // with the License.  You may obtain a copy of the License at
// //
// //  http://www.apache.org/licenses/LICENSE-2.0
// //
// // Unless required by applicable law or agreed to in writing,
// // software distributed under the License is distributed on an
// // "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// // KIND, either express or implied.  See the License for the
// // specific language governing permissions and limitations
// // under the License.
// ///////////////////////////////////////////////////////////////////////////////
// package de.tud.stg.tigerseye.lang.logo.dspcl;

// import de.tud.stg.tigerseye.lang.logo.dsjpm.LeftJoinPoint;
// import de.tud.stg.tigerseye.lang.logo.dsjpm.RightJoinPoint;
// import de.tud.stg.tigerseye.lang.logo.dsjpm.TurtleTurnJoinPoint;
// import de.tud.stg.popart.joinpoints.JoinPoint;
// import de.tud.stg.popart.pointcuts.Pointcut;

// public class TurtleTurningDegreesRangePCD extends Pointcut {

// 	public TurtleTurningDegreesRangePCD(int minDegrees, int maxDegrees) {
// 		super("pturning(minDegrees,maxDegrees)");
// 		this.minDegrees = minDegrees;
// 		this.maxDegrees = maxDegrees;
// 	}
	
// 	private int minDegrees;

// 	public int getMinDegrees() {
// 		return minDegrees;
// 	}

// 	public void setMinDegrees(int minDegrees) {
// 		this.minDegrees = minDegrees;
// 	}

// 	private int maxDegrees;

// 	public int getMaxDegrees() {
// 		return maxDegrees;
// 	}

// 	public void setMaxDegrees(int maxDegrees) {
// 		this.maxDegrees = maxDegrees;
// 	}

// 	@Override
// 	public boolean match(JoinPoint jp) {
// 		return 
// 		  ((jp instanceof LeftJoinPoint) ||
// 		  (jp instanceof RightJoinPoint)) &&
// 		  (minDegrees <= ((TurtleTurnJoinPoint)jp).getDegrees() && 
// 		   maxDegrees >= ((TurtleTurnJoinPoint)jp).getDegrees());
// 	}
// }
