# filereader by Pichaaun Popukdee
I ran the tasks on a HP Pavilion with intel(R) Core i7-5500 CPU @2.40GHz 
and got these results:

Task                                         | Time
------------------------------------------------------------
using FileReader, append to String.          | 6.193240 sec.
------------------------------------------------------------
using FileReader, append to StringBuilder.   | 0.022262 sec.
------------------------------------------------------------
using BufferReader, append to String.        | 0.565746 sec.
------------------------------------------------------------

## Explanation of Results

FileReader append to String is slower than BufferReader and FileReader append to StringBuilder
,but FileReader append to StringBuilder is faster than BufferReader.
A FileReader class is a general tool to read in characters from a File.
The BufferedReader class can wrap around Readers, like FileReader.

FileReader append to String is slower than FileReader append to StringBuilder 
because, ...
