# Dynamic implementation of a queue using generics

This implementation of a dynamic queue uses Java generics, so it can be used with any type of custom objects.  Each element of the queue is stored in a `Node()` that contains the enqueued object (`data`) and a reference to the next element in the queue (`next`).  This simplifies the `dequeue()` method and makes it easier to list all enqueued elements.  In reference to the queue itself, it consists of three variables:
* `start`: a reference to the first element on the queue.
* `end`: a reference to the last element on the queue.
* `size`: the total number of elements waiting in the queue.

## Implemented Methods
The methods that have been implemented are:
* `enqueue()`: adds the element indicated as an argument to the end of the queue.
* `dequeue()`: removes and returns the firts element waiting in the queue.  Throws the exception `QueueIsEmpty` if there are no elements to be removed.
* `getLenght()`: returns the number of elements that are waiting in the queue.
* `isEmpty()`: returns true if the queue is empty, false if it has one element or more in it.

## Implemented Exceptions
The exceptions used are:
* `QueueIsEmpty`: in case the `dequeue()` method is called when the queue is empty.

