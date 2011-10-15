/*
 * #%L
 * GraphWalker Core
 * %%
 * Copyright (C) 2011 GraphWalker
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */
package org.graphwalker.multipleModels;

import org.graphwalker.ModelBasedTesting;
import org.graphwalker.generators.PathGenerator;

/**
 * @author krikar Any test should extend this class.
 */
public class ModelAPI {
	private ModelBasedTesting mbt = null;

	public ModelAPI(String model, boolean efsm, PathGenerator generator, boolean weight) {
		mbt = new ModelBasedTesting();
		mbt.readGraph(model);
		mbt.enableExtended(efsm);
		mbt.setGenerator(generator);
		mbt.setWeighted(weight);
	}

	public void setMbt(ModelBasedTesting mbt) {
		this.mbt = mbt;
	}

	public ModelBasedTesting getMbt() {
		return mbt;
	}
}