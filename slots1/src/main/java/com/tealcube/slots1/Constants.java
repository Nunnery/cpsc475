/*
 * This file is part of CPSC475, licensed under the ISC License.
 *
 * Copyright (c) 2016, Richard Harrah <richard.harrah.13@cnu.edu>
 *
 * Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby granted,
 * provided that the above copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
 * INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN
 * AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THIS SOFTWARE.
 */
package com.tealcube.slots1;

/**
 * Contains all of the constants for the slots1 app.
 *
 * @author Richard Harrah
 * @version 19012016
 */
public final class Constants {

    /**
     * Represents the number of flowers used by the app.
     */
    public static final int NUMBER_OF_FLOWERS = 3;

    /**
     * Represents the amount of spins that you can perform.
     */
    public static final int STARTING_SPINS = 5;

    /**
     * Represents the amount of spins remaining where the game ends.
     */
    public static final int MINIMUM_SPINS = 0;

    /**
     * Represents the amount each spin costs.
     */
    public static final int COST_PER_SPIN = 1;

    public static final int MATCH_2 = 2;

    public static final int MATCH_3 = 3;

    private Constants() {
        // do nothing, prevents instantiation
    }

}
