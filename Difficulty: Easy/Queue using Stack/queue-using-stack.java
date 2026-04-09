class myQueue {

    // Initialize your data members
    Stack<Integer> input=new Stack<>();
    Stack<Integer> output=new Stack<>();
    
    void enqueue(int x) {
        // Implement enqueue operation
        input.push(x);
    }

    void dequeue() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        if(!output.isEmpty()){
            output.pop();
        }
        // Implement dequeue operation
    }

    int front() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.isEmpty()?-1:output.peek();
        // Implement front operation
    }

    int size() {
        // Implement size operation
        return input.size()+output.size();
        
    }
}
